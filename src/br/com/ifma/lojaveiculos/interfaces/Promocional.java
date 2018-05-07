
package br.com.ifma.lojaveiculos.interfaces;

import java.math.BigDecimal;
/**
 * Classe que representa uma Interface Promocional.
 * @author Márcio e Jaqueline
 * @version 1.0
 */
@FunctionalInterface // indentificar como funcional 
public interface Promocional {
    void aplicarDesconto(BigDecimal porcentagem);
    
}
