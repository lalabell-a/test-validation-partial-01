package ec.edu.epn.skyroute.service;

import org.springframework.stereotype.Service;

/**
 * Calcula las tarifas de equipaje para la aerolínea SkyRoute Airlines.
 * <p>
 * Reglas de negocio:
 * <ol>
 *   <li>Tarifa base: $30.0 por maleta.</li>
 *   <li>Exceso de peso: +$50.0 si una maleta pesa más de 23 kg.</li>
 *   <li>Beneficio VIP: primera maleta gratis si el pasajero es VIP
 *       y la maleta no excede 23 kg.</li>
 *   <li>Excepciones: weight ≤ 0, bagCount < 1, o passengerId nulo
 *       lanzan IllegalArgumentException.</li>
 * </ol>
 */
@Service
public class BaggageFeeCalculator {

    private final PassengerService passengerService;

    public BaggageFeeCalculator(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    /**
     * Calcula la tarifa total de equipaje.
     *
     * @param weight       peso de cada maleta (kg)
     * @param bagCount     cantidad de maletas
     * @param passengerId  identificador del pasajero
     * @return costo total en dólares
     * @throws IllegalArgumentException si los parámetros no cumplen las restricciones
     */

/**Tarifa Base:** Cada maleta tiene un costo base de **$30.0**.
2. **Exceso de Peso:** Si una maleta pesa **más de 23 kg**, se le aplica un recargo único de **$50.0** (además de la tarifa base).
3. **Beneficio VIP:** Si el pasajero es clasificado como VIP por el sistema externo, la **primera maleta es completamente gratis** ($0.0), siempre y cuando el peso de esa maleta **no supere los 23 kg**. Si lleva más de una maleta, las siguientes se cobran con tarifa normal.
4. **Restricciones de Integridad (Excepciones):**
   - `weight` no puede ser menor o igual a 0 kg.
   - `bagCount` debe ser al menos 1.
   - `passengerId` no puede ser `null`.
   - Si no se cumple alguna restricción, lanzar `IllegalArgumentException` con el mensaje: `"Parámetros de equipaje inválidos"`.*/

    public double calculateFee(double weight, int bagCount, Long passengerId) {
        if ( weight >= 23.00){
            return 80.0;
        } elseIf ( passengerID = 0);
        {
            return 00.0;

        } elseIf ( bagCount > 1);{
            return 30.00;
        } elseIf (weight >= 23.00);{
            return 80.0;
        }
        If(passengerId == null || weight <= 0 || bagCount <=0);{
            return ("IllegalArgumentException");
        }
        return 0.0;

    }
}
