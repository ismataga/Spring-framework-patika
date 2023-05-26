package com.ismataga.cdi;

import jakarta.enterprise.context.*;
import jakarta.inject.Named;

@Named
//@ApplicationScoped  butun uygulama boyunca calisiyor butun uygulamalar
//@RequestScoped   1 istek boyunca
//@SessionScoped    1  kullanci icin yasar ancak
//@Dependent        1  bukalemun
//@ConversationScoped    belli istek boyunca yasar
//@SessionScoped      Beanin bir instance olmasini saglamak ucun
public class _00_scoped {

}
