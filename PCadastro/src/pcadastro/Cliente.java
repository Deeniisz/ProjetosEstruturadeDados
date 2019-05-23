package pcadastro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Cliente extends Pessoa {
    String rg;
    int id;
    Date nascimento;

    public Cliente() throws ParseException {
        rg = "00.000.000-0";
        id = 0;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        nascimento = formato.parse("01/12/1900");
    }
    
    public Date getNascimento()
    {
        return nascimento;
    }
    
    
}
