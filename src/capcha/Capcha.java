
package capcha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Capcha {

    public static void main(String[] args) {
       String captcha [] = new String [62];
       String urlCaptcha [] = new String [62]; 
       byte ascii = 48;
        for (int i = 0; i <captcha.length; i++) {
            
            captcha[i] = Character.toString((char)ascii);
            ascii++;
            switch (ascii){
                case 58 :
                    ascii=65;
                    break;
                case 91:
                    ascii=97;
                    break;
                case 123:
                    break;
                    
               
 
            }
            System.out.println(captcha[i] + "  Valor de ascii =" + ascii);
        }
        
        String fecha ="12/34/5567";
        System.out.println(fecha.length());
        String f =  fecha.substring(6,8);
        System.out.println(f);
        
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate fechaNac = LocalDate.parse("10/11/1989", fmt);
LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fechaNac, ahora);
    System.out.printf("Tu edad es: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
                            
                            String input = "06/2020"; // for example
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yyyy");
simpleDateFormat.setLenient(false);
Date expiry;
        try {
            expiry = simpleDateFormat.parse(input);
            boolean expired = expiry.before(new Date());
            System.out.println(expired);
        } catch (ParseException ex) {
            Logger.getLogger(Capcha.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
     
    }
    
}
