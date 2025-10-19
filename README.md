[![CI & Render Deploy](https://github.com/codexrodrigues/praxis-api-quickstart/actions/workflows/render-deploy.yml/badge.svg?branch=main)](https://github.com/codexrodrigues/praxis-api-quickstart/actions/workflows/render-deploy.yml)

# API Quickstart (Praxis Metadata Starter)

Pequeno projeto Spring Boot com `praxis-metadata-starter` pronto para consumir variáveis de ambiente e conectar em banco PostgreSQL (Neon), com perfis `dev` e `prod`.

## Dependências chave
- `io.github.codexrodrigues:praxis-metadata-starter` — auto-configuração, `/schemas/filtered` e enriquecimento OpenAPI x-ui.
- `org.springframework.boot:spring-boot-starter-data-jpa`
- `org.postgresql:postgresql`

## Perfis e variáveis
- Base: `src/main/resources/application.properties` — Swagger e propriedades do starter.
- Dev: `src/main/resources/application-dev.properties` — usa envs e fallback local.
- Prod: `src/main/resources/application-prod.properties` — usa envs para produção.

Ambas suportam as variáveis:
- `SPRING_DATASOURCE_URL` (preferida) ou `DATABASE_URL` (fallback)
- `SPRING_DATASOURCE_USERNAME`
- `SPRING_DATASOURCE_PASSWORD`
- `DB_POOL_SIZE` (opcional)

Arquivos de exemplo para preenchimento:
- `.env.dev.example`
- `.env.prod.example`

## Neon: converter DSN em JDBC
DSN fornecida (não comitar segredos):
```
postgresql://neondb_owner:<PASSWORD>@ep-blue-butterfly-ad8tnape-pooler.c-2.us-east-1.aws.neon.tech/neondb?sslmode=require&channel_binding=require
```
JDBC correspondente (remova `channel_binding` — o driver JDBC não utiliza):
```
jdbc:postgresql://ep-blue-butterfly-ad8tnape-pooler.c-2.us-east-1.aws.neon.tech/neondb?sslmode=require
```
Vars:
```
SPRING_DATASOURCE_URL=jdbc:postgresql://.../neondb?sslmode=require
SPRING_DATASOURCE_USERNAME=neondb_owner
SPRING_DATASOURCE_PASSWORD=<PASSWORD>
```

## Render (produção)
No dashboard do Render, defina as variáveis de ambiente:
- `SPRING_PROFILES_ACTIVE=prod`
- `SPRING_DATASOURCE_URL` (JDBC)
- `SPRING_DATASOURCE_USERNAME`
- `SPRING_DATASOURCE_PASSWORD`
- `DB_POOL_SIZE` (opcional)

Opcionalmente, se o provedor expõe `DATABASE_URL` (DSN), mantenha também `SPRING_DATASOURCE_URL` com a versão JDBC.

## Rodar local
Este quickstart usa o starter publicado no Maven Central:

- Coordinates: `io.github.codexrodrigues:praxis-metadata-starter:1.0.0-beta.1`

1) Build (repo standalone)
```
./mvnw -B -DskipTests package
# ou
mvn  -B -DskipTests package
```
2) Executar (dev):
```
# carrega .env.dev.example manualmente ou exporte variáveis
SPRING_PROFILES_ACTIVE=dev \
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/praxis?sslmode=disable \
SPRING_DATASOURCE_USERNAME=postgres \
SPRING_DATASOURCE_PASSWORD=postgres \
java -jar target/praxis-api-quickstart-1.0.0-SNAPSHOT.jar
```
Swagger UI: http://localhost:8088/swagger-ui.html

## Endpoints úteis
- Swagger UI: `http://localhost:8088/swagger-ui.html`
- Schemas enriquecidos (exemplo): `/schemas/filtered?path=/api/human-resources/funcionarios&operation=post&schemaType=request`

## Padrões de SELECTs e Filtros (Options)

Quando usar `POST /{resource}/options/filter`
- Preencher selects/multi-select/autocomplete com projeção leve `OptionDTO{id,label,extra}`.
- Vantagens: payload mínimo, paginação, filtros tipados (usa o mesmo FilterDTO do recurso).
- Como configurar no `@UISchema` (campos relacionais):
  - `controlType=SELECT` (ou equivalente)
  - `endpoint="/api/.../{resource}/options/filter"`
  - `valueField="id"`, `displayField="label"`

Quando usar `GET /{resource}/options/by-ids`
- Reidratar opções por IDs já conhecidos (pré‑seleção, chips) preservando a ordem.
- Limites: respeita `praxis.query.by-ids.max`.

Quando usar `POST /{resource}/filter` (não options)
- Listagens “ricas” (tabelas/grades) que precisam do DTO completo.
- Para diálogos de seleção com muitos atributos visíveis, prefira `/filter`.

Boas práticas
- Grandes datasets: use `/options/filter` com o FilterDTO alvo (ex.: busca por nome/código).
- Pré‑seleção: reidrate com `/options/by-ids` (ordem garantida).
- Mantenha `size` moderado; utilize `X-Data-Version` para cache de listas.

### Exemplos rápidos de Options

Funcionários (options paginadas)
```
curl -s -X POST 'http://localhost:8088/api/human-resources/funcionarios/options/filter?page=0&size=10' \
  -H 'Content-Type: application/json' \
  -d '{"nomeCompleto":"ana"}' | jq .
```

Funcionários (reidratar por IDs com ordem preservada)
```
curl -s 'http://localhost:8088/api/human-resources/funcionarios/options/by-ids?ids=3,1,2' | jq .
```

Folhas de Pagamento (filter completo para tabelas)
```
curl -i -s -X POST 'http://localhost:8088/api/human-resources/folhas-pagamento/filter?page=0&size=5' \
  -H 'Content-Type: application/json' \
  -d '{"ano": 2024}' | sed -n '1,40p'
```
Observação: verifique o cabeçalho `X-Data-Version` na resposta para estratégias de cache.

### Schemas enriquecidos (/schemas/filtered)
- Solicita o schema do endpoint informando `path`, `operation` (get|post|put|delete) e `schemaType` (request|response).
- Exemplo (schema de request para criar funcionário):
  - `/schemas/filtered?path=/api/human-resources/funcionarios&operation=post&schemaType=request`

### Options (combos leves)
- Endpoints padrão fornecidos pelos controllers base:
  - `POST {resource}/options/filter` — pagina opções por filtro; retorna `{id,label}`.
  - `POST {resource}/options/by-ids` — retorna opções por IDs.
- Exemplos:
  - `POST /api/human-resources/funcionarios/options/filter`
  - `POST /api/human-resources/folhas-pagamento/options/by-ids`

### Novos recursos (HR)
- Cargos: `/api/human-resources/cargos`
- Departamentos: `/api/human-resources/departamentos`
- Funcionários: `/api/human-resources/funcionarios`
- Endereços: `/api/human-resources/enderecos`
- Dependentes: `/api/human-resources/dependentes`
- Folhas de Pagamento: `/api/human-resources/folhas-pagamento`
- Eventos da Folha: `/api/human-resources/eventos-folha`
- Férias/Afastamentos: `/api/human-resources/ferias-afastamentos`

### Exemplo de cURL (filter)
```
curl -s -X POST 'http://localhost:8088/api/human-resources/folhas-pagamento/filter?page=0&size=5' \
  -H 'Content-Type: application/json' \
  -d '{"ano": 2024, "funcionarioId": 1}' | jq .
```

### Exemplo de cURL (options)
```
curl -s -X POST 'http://localhost:8088/api/human-resources/funcionarios/options/filter?page=0&size=10' \
  -H 'Content-Type: application/json' \
  -d '{}' | jq .
```

## Notas
- `ddl-auto`: `update` (dev) e `validate` (prod). Ajuste conforme migrações existentes.
- Se um provedor fornecer apenas `DATABASE_URL` no formato DSN, converta para JDBC antes de setar `SPRING_DATASOURCE_URL`.
- Dependência do Praxis no Central: `io.github.codexrodrigues:praxis-metadata-starter` (nenhuma etapa prévia de build local é necessária).

## CI/Deploy (Render)

Este repositório inclui um workflow do GitHub Actions para acionar o deploy no Render.

- Arquivo do workflow: `.github/workflows/render-deploy.yml`
- Disparos: push na branch `main` ou manual (`workflow_dispatch`).
- Passos:
  - Build com Java 21 e Maven Wrapper (`./mvnw -B -DskipTests -ntp package`).
  - Chama o Deploy Hook do Render.

Configuração necessária (uma vez):
1. No Render, crie/configure o serviço web apontando para este repo (ou use um Deploy Hook existente).
2. Copie a URL do Deploy Hook do serviço no Render.
3. No GitHub (Settings → Secrets and variables → Actions → New repository secret):
   - Nome: `RENDER_DEPLOY_HOOK`
   - Valor: URL completa do Deploy Hook do Render.
4. Configure as variáveis no Render (Dashboard → Environment):
   - `SPRING_PROFILES_ACTIVE=prod`
   - `SPRING_DATASOURCE_URL`, `SPRING_DATASOURCE_USERNAME`, `SPRING_DATASOURCE_PASSWORD`
   - `DB_POOL_SIZE` (opcional)

Após isso, cada push em `main` roda o build e aciona o deploy no Render.

## Higiene de commits (o que commitar)

- Commitar:
  - `src/`, `pom.xml`, `README.md`, `LICENSE`, `AGENTS.md`, `.github/`, `.mvn/wrapper/maven-wrapper.properties`, `mvnw`, `mvnw.cmd`.
- Não commitar:
  - `target/` (artefatos de build), logs (`*.log`), dumps (`hs_err_pid*`).
  - Variáveis reais de ambiente (`.env`, `.env.*`); use somente os exemplos (`.env.*.example`).
  - Pastas/arquivos de IDE: `.idea/`, `.vscode/`, `*.iml`, `.classpath`, `.project`, `.settings/`.
  - Binários gerados temporários, arquivos de merge (`*.orig`, `*.rej`), temporários de editor (`*.swp`, `*.swo`, `*~`).

Observação
- O `maven-wrapper.jar` não é commitado por padrão; o `mvnw` baixa-o automaticamente no CI quando necessário.
