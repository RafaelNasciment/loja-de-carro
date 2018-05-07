
package br.com.ifma.lojaveiculos;

import br.com.ifma.lojaveiculos.cliente.Cliente;
import br.com.ifma.lojaveiculos.cliente.Empregador;
import br.com.ifma.lojaveiculos.cliente.Fiador;
import br.com.ifma.lojaveiculos.cliente.PessoaFisica;
import br.com.ifma.lojaveiculos.formapagamento.Financiamento;
import br.com.ifma.lojaveiculos.usuario.Usuario;
import br.com.ifma.lojaveiculos.veiculo.VeiculosNovos;
//import br.com.ifma.lojaveiculos.veiculo.VeiculosSemiNovos;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import javax.swing.JOptionPane;
//import java.time.format.DateTimeFormatter;
//import java.text.SimpleDateFormat;

/**
 * 
 * @author Márcio e Jaqueline
 */
public class LojaVeiculos {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        /*Usuario user = new Usuario("jaqueline", "2345", 1);
        user.efetuarLogin(JOptionPane.showInputDialog("Informe seu usuario: "),
                JOptionPane.showInputDialog("Digite sua senha: "));
        */
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Empregador empregador = new Empregador("Anatel", "(11) 4567-1234", "Rua São Francisco,"
                                    + " nº 1234, Centro. São Paulo-SP", "anatel@faleconosco.com");
        
        Fiador fiador = new Fiador("344654789-43", "'6736371748", LocalDate.parse("20/09/1990",formato), "Masculino",
                                    "Engenheiro", new BigDecimal("1000000"), empregador, "Antonio Oliveira", 
                                    "(11)7890-9090", "Rua Noruega, nº1122", "Jardim Brasil", "SP", "23351-000", "São Paulo",
                                    "antonio.oliveira@mail.com");
        
        Cliente cliente = new PessoaFisica("6666768-00", "7878779", LocalDate.parse("15/09/1987", formato), "Feminino", "TI",
                                    new BigDecimal("800000"), empregador, fiador, "Jaqueline Santos", "(11)2455-3455", 
                                    "Travessa Independente", "Morumbi", "SP", "99990-000", "São Paulo", "jaqueline.santos@gmail.com");
        
        VeiculosNovos veiculo = new VeiculosNovos(5, 1234, "Hilux, Cabine Dubla, Diesel.", 
                                    2018, "Preta", "Toyota", 2017, new BigDecimal("200000"), 
                                    177, 2.8,"Automático de 6 machas");
        
        Financiamento f = new Financiamento(new BigDecimal("50000"), new BigDecimal("0.03"), 36, fiador, 123234, 
                                    cliente, veiculo.getValor(), veiculo);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        NumberFormat pf = NumberFormat.getPercentInstance();
        
        JOptionPane.showMessageDialog(null, "Financiamento de Veiculos."
                +"\nCliente: " + f.getCliente().getNome()
                + "\nVeiculo: " + f.getVeiculo().getDescricao() 
                + "\nValor: " + nf.format(f.getVeiculo().getValor())
                + "\nEntrada: " + nf.format(f.getEntrada())
                + "\nTaxa de Juros: " + pf.format(f.getTaxaJuros())
                + "\nValor financidado: " +  nf.format(f.getValorFinanciado())
                + "\nPrazo: " + f.getNumeroParcela()
                + "\nValor Parcelas: " +  nf.format( f.getValorParcela())
                + "\nValor Final: " + nf.format( f.getValorFinal()));
               // +"\nVencimento das parcelas: " + Arrays.asList( f.getDataParcelas()));
        
        for(LocalDate data : f.getDataParcelas()){
            System.out.println(formato.format(data));
        }
        
        /*JOptionPane.showMessageDialog(null, "Descrição: " + veiculo.getDescricao() + "\nEmplacamento: " + veiculo.getValorEmplacar());
       
        System.out.println("Descriçao: " + veiculo.getDescricao());
        System.out.println("Valor: " + veiculo.getValor());
        System.out.println("Cilindrada: " + veiculo.getCilindrada());
        veiculo.setLimiteDesconto(new BigDecimal("0.1"));
        veiculo.aplicarDesconto(new BigDecimal("0.05"));
        System.out.println("Valor com desconto: " + veiculo.getValorcomDesconto());
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        VeiculosSemiNovos veiculo = new VeiculosSemiNovos(10000, LocalDate.parse("20/05/2017", formato), 
                                                                     "Jaqueline Barros", "WER-3234", new BigDecimal("0.2") ,1234,
                                                            "Land ROver Evoque, 4 portas, câmbio CVT, flex.", 2018, 
                                                               "Branca", "Land ROver",2017, new BigDecimal("2000000"), 240, 2.1, "CVT");
        
        System.out.println("Descriçao: " + veiculo.getDescricao());
        System.out.println("Valor: " + veiculo.getValor());
        System.out.println("Cilindrada: " + veiculo.getCilindrada());
        System.out.println("Data da Compra: " + formato.format(veiculo.getDataCompra()));
        System.out.println("Tempo de Uso: " + veiculo.getTempodeUso());
        
        veiculo.setLimiteDesconto(new BigDecimal("0.1"));
        veiculo.aplicarDesconto(new BigDecimal("0.05"));
        System.out.println("Valor com desconto: " + veiculo.getValorcomDesconto());
    */
    }
}
