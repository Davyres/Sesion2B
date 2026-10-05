
public class Empleado {
	public enum TipoEmpleado {
	    VENDEDOR,
	    ENCARGADO
	}

    public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
        float salarioBase = 0;
        float prima = 0;
        
        // Determinar salario base
        if (tipo == TipoEmpleado.VENDEDOR) {
            salarioBase = 2000.0f;
        } else if (tipo == TipoEmpleado.ENCARGADO) {
            salarioBase = 2500.0f;
        }
        
        // Determinar prima por ventas
        if (ventasMes >= 1500.0f) {
            prima = 200.0f;
        } else if (ventasMes >= 1000.0f) {
            prima = 100.0f;
        }
        
        // Determinar pago por horas extra
        float pagoHorasExtra = horasExtra * 30.0f;
        
        return salarioBase + prima + pagoHorasExtra;
    }

    public float calculoNominaNeta(float nominaBruta) {
        float retencion = 0.0f;
        
        // Determinar porcentaje de retención
        if (nominaBruta >= 2500.0f) {
            retencion = 0.18f;
        } else if (nominaBruta >= 2100.0f) {
            retencion = 0.15f;
        }
        
        return nominaBruta * (1 - retencion);
    }
}
