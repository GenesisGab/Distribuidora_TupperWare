
public class Main {

	public static void main(String[] args) {
		
		//DEFINICION DE VARIABLES
		final String nombreEmpresa = "DISTRIBUIDORA TUPPERWARE";
		
		double costoUnitario = 30;//45
		int cantidadProducto = 100;
		double totalAPagar = costoUnitario*cantidadProducto; //Q
		final double precioDeVenta = 60;
		final double IVA = 0.12;//12%
		double totalIVAPorUnidad = precioDeVenta*IVA;
		
		//IMPRESION DE DATOS EN CONSOLA
		System.out.println("      EMPRESA: "+nombreEmpresa);
		System.out.println("**********************************************");
		System.out.println("");
		System.out.println("            Costo por unidad: Q "+costoUnitario);
		System.out.println("        Cantidad de Producto:   "+cantidadProducto);
		System.out.println("----------------------------------------------");
		System.out.println("                       Total: Q "+totalAPagar);
		System.out.println("");
		System.out.println("                  Venderse a: Q "+precioDeVenta);
		System.out.println("        Impuesto establecido:   "+IVA);
		System.out.println("Impuesto por unidad comprada: Q "+totalIVAPorUnidad);
		
		
		int cantidadProductoVendido = 40;
		double totalCobradoSinDescuento = cantidadProductoVendido*precioDeVenta;
		
		double tipoDeDescuento = 0;
		double totalConDescuento = 0;
		
		
		// SE DETERMINA SI A LA CANTIDAD VENDIDA LE CORRESPONDE DESCUENTO O NO
		
		if(cantidadProductoVendido>=50) {
			tipoDeDescuento = 0.05;
			totalConDescuento = totalCobradoSinDescuento - (totalCobradoSinDescuento*tipoDeDescuento);
		}
		
		if(cantidadProductoVendido>=100) {
			tipoDeDescuento = 0.15;
			totalConDescuento = totalCobradoSinDescuento - (totalCobradoSinDescuento*tipoDeDescuento);
		}
			
		if(cantidadProductoVendido>=1000) {
			tipoDeDescuento = 0.25;
			totalConDescuento = totalCobradoSinDescuento - (totalCobradoSinDescuento*tipoDeDescuento);
		}
		
		
		
		double impuestotalADeclarar = totalConDescuento *IVA;
		double ganancias = (totalCobradoSinDescuento - (cantidadProductoVendido*costoUnitario))-impuestotalADeclarar;
		
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println("");
		System.out.println("             Cantidad Vendida:   "+cantidadProductoVendido);
		System.out.println("          Total sin descuento: Q "+totalCobradoSinDescuento);
		System.out.println("          Total con descuento: Q "+totalConDescuento);
		System.out.println("               IVA a declarar: Q "+impuestotalADeclarar);
		System.out.println("            Tipo de descuento:   "+tipoDeDescuento);
		System.out.println("                     Ganancia: Q "+ganancias);
	
		

	}

}
