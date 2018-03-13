/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.Ordenacao;
import java.awt.Dimension;
import java.util.ArrayList;
import javafx.scene.chart.Chart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author janth
 */
public class GraficosBarras {
    
    public CategoryDataset createDataset(ArrayList<Ordenacao> ListaOrdenacao){
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(Ordenacao ordena : ListaOrdenacao){
            dataSet.addValue(ordena.getTempGasto(), ordena.getNomeMetodo(),"");
        } 
        return dataSet;
    }
    
    public JFreeChart createBarChart(CategoryDataset dataSet){
//    public JFreeChart createBarChart(CategoryDataset dataSet, String tipoOrdenacao){
        JFreeChart graficoBarras = ChartFactory.createBarChart("Ordenação - Em milissegundos","Métodos Utilizados","TEMPO GASTO EM MS", dataSet, PlotOrientation.VERTICAL, true, true, false);
//        JFreeChart graficoBarras = ChartFactory.createBarChart(tipoOrdenacao+" - Em milissegundos","Métodos Utilizados","TEMPO GASTO EM MS", dataSet, PlotOrientation.VERTICAL, true, true, false);
       
        return graficoBarras;
    }
    
    public ChartPanel criarGrafico(ArrayList<Ordenacao> listaOrdenacao){
//    public ChartPanel criarGrafico(ArrayList<Ordenacao> listaOrdenacao, String tipoOrdenacao){
        
        CategoryDataset dataSet = this.createDataset(listaOrdenacao);
        
        JFreeChart grafico = this.createBarChart(dataSet);
//        JFreeChart grafico = this.createBarChart(dataSet, tipoOrdenacao);
        
        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        
        
        return painelDoGrafico;
    }
}
