Guia de Build para Agentes Codex — API Quickstart (Standalone)

Escopo e Precedência
- Escopo: este arquivo cobre apenas o diretório `examples/api-quickstart` (destinado a virar repositório próprio).
- Objetivo: compilar e empacotar o quickstart usando artefatos do Maven Central (sem depender do monorepo).

Pré‑requisitos
- Java 21 (`java -version` deve reportar 21.x).
- Maven Wrapper incluído no repo (use `./mvnw`) ou Maven instalado (`mvn`).
- Rede habilitada para baixar dependências (Maven Central).

Build e Execução
- Build (recomendado):
  - `./mvnw -B -DskipTests package`
- Executar (dev):
  - Configure variáveis (veja `README.md` → seção Perfis e variáveis)
  - Exemplo:
    - `SPRING_PROFILES_ACTIVE=dev SPRING_DATASOURCE_URL=jdbc:postgresql://... SPRING_DATASOURCE_USERNAME=... SPRING_DATASOURCE_PASSWORD=... java -jar target/praxis-api-quickstart-1.0.0-SNAPSHOT.jar`

Notas para Codex CLI
- Em ambientes com rede protegida, habilite rede ao rodar `./mvnw`/`mvn`.
- Prefira flags: `-B` (batch) e `-DskipTests` para rapidez.
