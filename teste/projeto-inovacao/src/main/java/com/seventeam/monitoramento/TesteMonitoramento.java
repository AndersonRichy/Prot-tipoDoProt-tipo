/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seventeam.monitoramento;

import oshi.hardware.platform.windows.WindowsCentralProcessor;


/**
 *
 * @author Aluno
 */
public class TesteMonitoramento {
    
    private String Processador;
    
    public void Monitor() {   
    
        WindowsCentralProcessor MonitoramentoCPU = new WindowsCentralProcessor();
        Processador = String.format("%s", MonitoramentoCPU);
    }

    public String getProcessador() {
        return Processador;
    }
    
}
