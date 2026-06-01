/*Escribe **al menos 5 métodos de prueba** usando `@Mock`, `@InjectMocks` y aserciones de JUnit 5 que cubran:*/

import ec.edu.epn.skyroute.service.BaggageFeeCalculator;

public class BaggageFeeCalculaterTest{
    public BaggageFeeCalculator baggageFeeCalculator;
    public PassengerService passengerService;

    @Mock
    Long passengerFalse = 1; 
    Long passengerTrue = 0;

    @DisplayName("Prueba uno: Equipaje estándar | 1 maleta, 20 kg, pasajero regular | **$30.00**")
    @Test
    public void TestEquipajeEstandar(){
        //Assert + Act
        double resultado = calculateFee(30.00, 1, 1);
        //Arrange
        assertequals(0, resultado);
    }

    //Prueba dos: Exceso de peso | 1 maleta, 25 kg, pasajero regular | **$80.00** |
    @Test
    public void TestEquipajeExceso(){
        //Assert + Act
        double resultado = calculateFee(30.00, 1, 1);
        //Arrange
        assertequals(0, resultado);
    }


    //Prueba tres: Beneficio VIP | 1 maleta, 15 kg, pasajero VIP | **$0.00** (requiere Mockito) |

    //Prueba cuatro: Caso límite VIP | 2 maletas, 15 kg c/u, pasajero VIP | **$30.00** (1ra gratis, 2da cobro normal) |

    //Prueba cinco: Validación de excepción | `weight = 0` o negativo | `IllegalArgumentException` |

}
