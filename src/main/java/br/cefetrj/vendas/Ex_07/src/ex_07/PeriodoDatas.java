/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PeriodoDatas {

    private final Date inicio;
    private final Date termino;

    public PeriodoDatas(String de, String ate) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String ini = null, fim = null;
        try {
            ini = formato.format(formato.parse(de));
            fim = formato.format(formato.parse(ate));    
                        
            this.inicio = formato.parse(ini);
            this.termino = formato.parse(fim);                                       

            if (inicio.after(termino)) {
                throw new IllegalArgumentException("Data Inicial maior que a Final");
            }
        } catch (ParseException ex) {
            throw new IllegalArgumentException("Data Inválida");
        }                       

    }

    public String getInicio() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(inicio);
    }

    public String getTermino() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(termino);
    }       

    class FaixaDatas{
        Date ini;
        Date fim;

        private FaixaDatas(Date inicio, Date termino,int qtd) {
           ini = inicio;
           fim = termino; 
           
           Calendar c = Calendar.getInstance();;
           c.setTime(fim);
           c.add(c.DAY_OF_MONTH, qtd);
                      
           fim = c.getTime();                                 
                      
        }

        public String getIni() {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            return formato.format(ini);
        }

        public String getFim() {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            return formato.format(fim);
        }               
    }
    
    public FaixaDatas prolongar(int numDias) {          
        return new FaixaDatas(this.inicio,this.termino,numDias);               
    }
}
