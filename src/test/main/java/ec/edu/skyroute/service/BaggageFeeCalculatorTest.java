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
    public void testEquipajeEstandar(){
        //Assert + Act
        double resultado = calculateFee(20, 1, 1);
        //Arrange
        assertequals(30.00, resultado);
    }

    @DisplayName("Prueba dos: Exceso de peso | 1 maleta, 25 kg, pasajero regular | **$80.00**")
    @Test
    public void testEquipajeExceso(){
        //Assert + Act
        double resultado = calculateFee(25, 1, 1);
        //Arrange
        assertequals(80.00, resultado);
    }


    @DisplayName("Prueba tres: Beneficio VIP | 1 maleta, 15 kg, pasajero VIP | **$0.00** (requiere Mockito)")
    @Test
    public void testBeneficioVIP(){
        //Assert + Act
        double resultado = calculateFee(15, 1, 0);
        //Arrange
        assertequals(0.00, resultado);
    }

    @DisplayName("Prueba cuatro: Caso límite VIP | 2 maletas, 15 kg c/u, pasajero VIP | **$30.00** (1ra gratis, 2da cobro normal)")
    @Test
    public void testCasoLimiteVIP(){
        //Assert + Act
        double resultado = calculateFee(15, 2, 0);
        //Arrange
        assertequals(30.00, resultado);
    }

    @DisplayName("Prueba cinco: Validación de excepción | `weight = 0` o negativo | `IllegalArgumentException`")
    @Test
    public void testValidacionExcepcion(){
        //Assert + Act
        double resultado = calculateFee(0, 1, 1);
        //Arrange
        assertequals("IllegalArgumentException");
    }

}
