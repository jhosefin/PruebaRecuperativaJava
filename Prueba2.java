import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

//? Don José todos los martes y jueves realiza un 20% de descuento en el total de las
//		compras, crea una función la cual debe recibir un parámetro del día y el arreglo de
//		valores de los productos a comprar, esta debe retornar el total final de la compra según
//		corresponda o no descuento.

public class Prueba2 {



    public static void main(String[] args) {

        //ArrayList <Integer> valorProducto = new ArrayList <Integer>(Arrays.asList());

        Console console = System.console();

        System.out.println("-----------------------------------Descuento de 20% Para los dias MARTES y JUEVES--------------------------------------------");
        System.out.println("");
        int suma = 0;
        int productos = Integer.parseInt(console.readLine("Ingrese cuantos productos compro: "));

        String dia = console.readLine("Ingrese el dia de la compra: ");
        

        if (dia == "martes" || dia == "jueves"){ 

            for (var i = 1; i < productos+1 ; i++){
                int valores = Integer.parseInt(console.readLine("Ingrese el valor del producto "+i+":"));
                System.out.println(valores);
            
                suma = valores + suma;
        }
        var procesando = suma - (suma * 0.20);
        System.out.println("Suerte!! Hoy tenemos descuento, su total seria de  "  + procesando);
            
        }else{

            for (var i = 1; i < productos+1; i++){

                int valores = Integer.parseInt(console.readLine("Ingrese el valor del producto "+i+":"));
                System.out.println(valores);
            
                suma = valores + suma;
        }
        System.out.println("No hay descuentos para este dia, el total de su compra es: " + suma);
        }




        //    ? Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
//		menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
//		total verificando si corresponde o no el descuento.


System.out.println("------------Descuento de 15% Para los clientes que compran mas de 3 productos y almenos uno con un precio mayor a 10.000 ----------------");
System.out.println("");


var cuenta =0;


if (productos > 3){ 

    for (var i = 1; i < productos+1; i++){

        int valores = Integer.parseInt(console.readLine("Ingrese el valor del producto "+i+":"));
        System.out.println(valores);
        if (valores > 10000){
            suma = valores + suma;
            var procesando = suma - (suma * 0.20);
            System.out.println("Suerte!! Hoy tenemos descuento, su total seria de  "  + procesando);
        }else{
            System.out.println("Oups!! Debe comprar un producto con un precio mayor a 10.000 para obtener el descuento";);

        }

    
}
}
    }
}


/*if (simayor > 10000){ 
    var descontadoTotal = cuenta - (cuenta * 0.05 );
resultado = "Por el total de su compra " + cuenta + " Obtuvo un descuento del 5%, quedando un total para pagar de " + descontadoTotal;
}

}else{
    resultado = "No le corresponde descuento, el total de su compra es: " + cuenta;
}
console.log(resultado);
return [resultado];

}

Verificando(Precios);
console.log("");



//			? Se desea tener una función verificadora encargada de revisar si dentro de el arreglo de
//				valores de los productos a comprar no existan valores negativos ingresados por error,
//				en caso de no existir debe retornar un mensaje de éxito, en caso contrario debe retornar
//				un mensaje de error junto con el número negativo y el índice en el que se encontraba.

console.log("------------------------ Verificando que no haya cuentas negativas ingresadas por error -----------------------------");
console.log("");

var PrecioProductos = [200,5500,900,-7000,500,300];

function  Verificador(array){  


    for (var i = 0; i < array.length ; i++){

        if(array[i] < 0 ){
    
            var valorNegativo = "Se encontro valor negativo " + array[i] +  " En la posicion " + i ;
            break;
            }else{
                valorNegativo = "Exito, nada negativo";
            }
}
console.log(valorNegativo);
return [valorNegativo];
}

Verificador(PrecioProductos);
console.log("");



//				? Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
//				producto
//				? Crea una función que retorne el valor del producto más costoso.

//				? Crea una función que retorne el valor del producto menos costoso.


console.log("--------------------------- Valor del producto mas costoso y menos costoso ---------------------------");
console.log("");
var numeros = [200,5500,900,7000,500,300];

function  MinMax(array){  
    var min = array[0];
    var max = array[0];

    for (var i = 0; i < array.length; i++){

            if(min > array[i] ){
    
                min = array[i];
            }
            if(max < array[i] ){
    
                max = array[i];
            }
}
console.log("El producto de menor precio es: " + min, " Y el producto de mayor precio es: " + max);
return [min,max];
}

MinMax(numeros);

                
            }
            
        }*/
    


