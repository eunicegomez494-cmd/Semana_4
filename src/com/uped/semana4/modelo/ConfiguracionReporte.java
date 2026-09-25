package com.uped.semana4.modelo;

public class ConfiguracionReporte {
    private final String titulo;
    private final boolean incluirGrafico;
    private final String formato;

    private ConfiguracionReporte(Builder b) {
        this.titulo = b.titulo;
        this.incluirGrafico = b.incluirGrafico;
        this.formato = b.formato;
    }

    public static class Builder {
        private String titulo = "Reporte General";
        private boolean incluirGrafico = false;
        private String formato = "PDF";

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder conGrafico() {
            this.incluirGrafico = true;
            return this;
        }

        public Builder formato(String formato) {
            this.formato = formato;
            return this;
        }

        public ConfiguracionReporte build() {
            return new ConfiguracionReporte(this);
        }
    }

    @Override
    public String toString() {
        return "ConfiguracionReporte{titulo='" + titulo + "', incluirGrafico=" + incluirGrafico + ", formato='" + formato + "'}";
    }
}