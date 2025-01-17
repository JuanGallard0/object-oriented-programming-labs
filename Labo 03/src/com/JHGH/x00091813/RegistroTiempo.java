package com.JHGH.x00091813;

public class RegistroTiempo {
    //atributos
    private int horaEntrada;
    private int minutoEntrada;
    private int horaSalida;
    private int minutoSalida;

    //constructor de entrada
    public RegistroTiempo(int horaEntrada, int minutoEntrada) {
        this.horaEntrada = horaEntrada;
        this.minutoEntrada = minutoEntrada;
        this.horaSalida = 0;
        this.minutoSalida = 0;
    }

    //getters
    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int getMinutoEntrada() {
        return minutoEntrada;
    }

    //setters
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setMinutoSalida(int minutoSalida) {
        this.minutoSalida = minutoSalida;
    }

    //metodos
    public float costoEstadia() {
        int diferenciaHora = horaSalida - horaEntrada;
        int diferenciaMinutos = minutoSalida - minutoEntrada;
        if (diferenciaHora > 2 || (diferenciaHora == 2 && diferenciaMinutos == 0))
            return 5.00f;
        else if (diferenciaHora == 1 && minutoSalida >= minutoEntrada)
            return 1.00f;
        else if (diferenciaMinutos <= 30 && diferenciaHora == 0)
            return 0.00f;
        else
            return 0.50f;
        }
    }
