package com.ulp;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ConversorTest.class,
        ConversorMonedaTest.class,
        CotizacionTest.class,
        DolaritosTest.class
})
public class MiSweetSuite {


}
