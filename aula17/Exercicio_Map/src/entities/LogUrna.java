package entities;

import java.util.Objects;

public class LogUrna implements Comparable<LogUrna>{

    private String name;
    private String qtdVoto;

    public LogUrna(String name, String qtdVoto) {
        this.name = name;
        this.qtdVoto = qtdVoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQtdVoto() {
        return qtdVoto;
    }

    public void setQtdVoto(String qtdVoto) {
        this.qtdVoto = qtdVoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogUrna logUrna)) return false;
        return Objects.equals(getQtdVoto(), logUrna.getQtdVoto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQtdVoto());
    }

    @Override
    public int compareTo(LogUrna o) {
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }

    @Override
    public String toString() {
        return "LogUrna{" +
                "Name='" + name + '\'' +
                ", Votos ='" + qtdVoto + '\'' +
                '}';
    }
}
