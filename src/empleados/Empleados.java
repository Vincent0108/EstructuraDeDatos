package empleados;

import java.util.Scanner;

public class Empleados {

    public class Empleado {
        private int codigoVendedor;
        private String nombre;
        private double salarioBasico;
        private double valorVenta;
        private double comision;

        public double comision() {
            if (valorVenta > 250 && valorVenta < 300) {
                comision = valorVenta * 0.20;
            } else if (valorVenta > 300 && valorVenta < 450) {
                comision = valorVenta * 0.25;
            } else if (valorVenta > 450) {
                comision = salarioBasico * 0.30;
            }
            return comision;
        }

        public int getCodigoVendedor() {
            return codigoVendedor;
        }

        public void setCodigoVendedor(int codigoVendedor) {
            this.codigoVendedor = codigoVendedor;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getSalarioBasico() {
            return salarioBasico;
        }

        public void setSalarioBasico(double salarioBasico) {
            this.salarioBasico = salarioBasico;
        }

        public double getValorVenta() {
            return valorVenta;
        }

        public void setValorVenta(double valorVenta) {
            this.valorVenta = valorVenta;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        Empleado []arreglo = new Empleado[10];

        int cod;
        String nombre;
        double salario, venta;

          //TIRA ERROR// 
          for(int i=0;i<arreglo.length;i++){

              System.out.println("Ingresa el codigo");
              cod = in.nextInt();
              arreglo[i].setCodigoVendedor(cod);
  //            System.out.println("Ingresa el nombre");
  //            nombre = in.nextLine();
  //            arreglo[i].setNombre(nombre);
  //            System.out.println("Ingresa el Salario basico");
  //            salario = in.nextDouble();
  //            arreglo[i].setSalarioBasico(salario);
  //            System.out.println("Ingrese valor de la venta");
  //            venta = in.nextDouble();
  //            arreglo[i].setValorVenta(venta);


          }
        
    }

}
