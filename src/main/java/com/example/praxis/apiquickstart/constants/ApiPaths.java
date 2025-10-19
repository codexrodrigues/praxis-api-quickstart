package com.example.praxis.apiquickstart.constants;

public final class ApiPaths {
    public static final String BASE = "/api";

    public static final class HumanResources {
        private static final String HR_BASE = BASE + "/human-resources";

        public static final String FUNCIONARIOS = HR_BASE + "/funcionarios";
        public static final String CARGOS = HR_BASE + "/cargos";
        public static final String DEPARTAMENTOS = HR_BASE + "/departamentos";
        public static final String ENDERECOS = HR_BASE + "/enderecos";
        public static final String DEPENDENTES = HR_BASE + "/dependentes";
        public static final String FOLHAS_PAGAMENTO = HR_BASE + "/folhas-pagamento";
        public static final String EVENTOS_FOLHA = HR_BASE + "/eventos-folha";
        public static final String FERIAS_AFASTAMENTOS = HR_BASE + "/ferias-afastamentos";
        public static final String HABILIDADES = HR_BASE + "/habilidades";
        public static final String AMEACAS = HR_BASE + "/ameacas";
        public static final String BASES = HR_BASE + "/bases";
        public static final String EQUIPES = HR_BASE + "/equipes";
        public static final String INDENIZACOES = HR_BASE + "/indenizacoes";
        public static final String INCIDENTES = HR_BASE + "/incidentes";
        public static final String LICENCAS_OPERACAO = HR_BASE + "/licencas-operacao";
        public static final String MENCOES_MIDIA = HR_BASE + "/mencoes-midia";
        public static final String REPUTACOES = HR_BASE + "/reputacoes";
        public static final String EQUIPAMENTOS = HR_BASE + "/equipamentos";
        public static final String VEICULOS = HR_BASE + "/veiculos";
        public static final String EQUIPAMENTO_ALOCACOES = HR_BASE + "/equipamento-alocacoes";
        public static final String VEICULO_MISSAO_USOS = HR_BASE + "/veiculo-missao-usos";
        public static final String IDENTIDADES_SECRETAS = HR_BASE + "/identidades-secretas";
        public static final String HISTORICOS_SALARIAIS = HR_BASE + "/historicos-salariais";
        public static final String HISTORICOS_CARGOS = HR_BASE + "/historicos-cargos";
        public static final String FUNCIONARIO_HABILIDADES = HR_BASE + "/funcionario-habilidades";
        public static final String ACORDOS_REGULATORIOS = HR_BASE + "/acordos-regulatorios";
        public static final String MISSOES = HR_BASE + "/missoes";
        public static final String BASE_ACESSOS = HR_BASE + "/base-acessos";
        public static final String EQUIPE_MEMBROS = HR_BASE + "/equipe-membros";
        public static final String SINAIS_SOCORRO = HR_BASE + "/sinais-socorro";
        public static final String MISSAO_EVENTOS = HR_BASE + "/missao-eventos";
        public static final String MISSAO_PARTICIPANTES = HR_BASE + "/missao-participantes";
        public static final String VW_RESUMO_MISSOES = HR_BASE + "/vw-resumo-missoes";
        public static final String VW_RANKING_REPUTACAO = HR_BASE + "/vw-ranking-reputacao";
        public static final String VW_PERFIL_HEROI = HR_BASE + "/vw-perfil-heroi";
        public static final String VW_INDICADORES_INCIDENTES = HR_BASE + "/vw-indicadores-incidentes";

        private HumanResources() {}
    }

    private ApiPaths() {}
}
