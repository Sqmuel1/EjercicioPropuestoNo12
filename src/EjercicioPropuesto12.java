
public class EjercicioPropuesto12 {
	
	public static void main(String[] args) {
	double horas_semana, pago_hora, retencion;
		
	horas_semana = 48;
	pago_hora = 5000;
	retencion = 0.125;
	
	System.out.println("El salario bruto es de: "+ horas_semana*4*pago_hora);
	System.out.println("La retención de la fuente es de: "+ retencion*100+"%");
	System.out.println("El salario neto es de: "+ horas_semana*4*pago_hora*(1-retencion));
	}
}
