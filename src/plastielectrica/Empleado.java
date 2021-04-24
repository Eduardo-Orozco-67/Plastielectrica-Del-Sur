
package plastielectrica;

public class Empleado extends Persona{
    //atributos de la clase 
     String RFC;
     int faltas, retardos, HT, SS, anti, HE, Cuotas, ID = 0;
     float sueldo, aguinaldo;
     
    //metodo empleado 
    Empleado()
    {
        super();
            RFC = "NULL";
            aguinaldo = 0;
            ID = 0 ;  
            faltas  = 0;
            retardos = 0 ; 
            HT = 0 ; 
            SS = 0 ; 
            anti = 0 ;
            HE = 0 ; 
            Cuotas = 0 ; 
        }
    
    //set y get 
    public void set_RFC(String RFC) {
        this.RFC = RFC;
    }

    public void set_aguinaldo(float aguinaldo) {
        this.aguinaldo = aguinaldo;
    }

    public void set_id(int ID) {
        this.ID= ID;
    }


    public String get_RFC() {
        return RFC;
    }

    public float get_aguinaldo() {
        return aguinaldo;
    }

    public int get_id() {
        return ID;
    }    

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getRetardos() {
        return retardos;
    }

    public void setRetardos(int retardos) {
        this.retardos = retardos;
    }

    public int getHT() {
        return HT;
    }

    public void setHT(int HT) {
        this.HT = HT;
    }

    public int getSS() {
        return SS;
    }

    public void setSS(int SS) {
        this.SS = SS;
    }

    public int getAnti() {
        return anti;
    }

    public void setAnti(int anti) {
        this.anti = anti;
    }

    public int getHE() {
        return HE;
    }

    public void setHE(int HE) {
        this.HE = HE;
    }

    public int getCuotas() {
        return Cuotas;
    }

    public void setCuotas(int Cuotas) {
        this.Cuotas = Cuotas;
    }


    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
     @Override
    public void llenado()
    {
        super.llenado();
        System.out.print("Dame el ID ");
        set_id(x.nextInt());
        System.out.print("Dame el RFC ");
        set_RFC(x.next());
//        System.out.print("Dame el tipo de aguinaldo");
//        set_aguinaldo(x.next());
    }
    
    //metodo para pedir datos del empleado quincenal
    public void empQuincenal(){
        int cantEmp;
        Empleado emp = new Empleado();
        System.out.println("\n");
        System.out.println("Ingresar la cantidad de empleados, los cuales se encuentran activos actualmente: \n");
        cantEmp = x.nextInt();
        for (int i = 0; i < cantEmp; i++) {
            emp.llenado();
            System.out.println("Ingresar el sueldo del empleado: \n");
            setSueldo(x.nextFloat());
            System.out.print("Ingresar las faltas acumuladas del empleado : \n");
            setFaltas(x.nextInt());
            System.out.println("Ingresar los retardos del empleado: \n");
            setRetardos(x.nextInt());
            System.out.println("Ingresar el total de Hotas Trabajadas: \n");
            setHT(x.nextInt());
            System.out.println("Ingresar el porcentaje el cual se le hace al empleado para pagar el seguro social: \n");
            setSS(x.nextInt());
            System.out.println("\n");
            
        }
    }
    
    //metodo para calcular el aguinaldo quincenal
    public void aguinaldoQuin(){
        int Meses;
        float cash, res;
        System.out.println("\n");
        System.out.println("EMPLEADO QUINCENAL");
        System.out.println("Ingresar las quincenas que lleva trabajando el empleado en la empresa: \n");
        Meses = x.nextInt();
        System.out.println("Ingresar el sueldo que recibe el empleado: ");
        cash=x.nextFloat();
        cash = cash/15;
        res = cash*Meses;
        System.out.println("El aguinaldo a recibir es de: " + res + " pesos.");
        System.out.println("\n");
    }
    
    //metodo para pedir datos del empleado mensual
    public void empMensual(){
        int cantEmp;
        Empleado emp = new Empleado();
        System.out.println("\n");
        System.out.println("Ingresar la cantidad de empleados, los cuales se encuentran activos actualmente: \n");
        cantEmp = x.nextInt();
        for (int j = 0; j < cantEmp; j++) {
            emp.llenado();
            System.out.println("Ingresar el sueldo del empleado: \n");
            setSueldo(x.nextFloat());
            System.out.print("Ingresar las faltas acumuladas del empleado : \n");
            setFaltas(x.nextInt());
            System.out.println("Ingresar los retardos del empleado: \n");
            setRetardos(x.nextInt());
            System.out.println("Ingresar el total de HT: \n");
            setHT(x.nextInt());
            System.out.println("Ingresar el porcentaje el cual se le hace al empleado para pagar el seguro social: \n");
            setSS(x.nextInt());
            System.out.println("Ingresar los años que lleva trabajando el empleado en la empresa: \n");
            setAnti(x.nextInt());
            System.out.println("Ingresar las HE: \n");
            setHE(x.nextInt());
            System.out.println("Ingresar la cantidad a descontar por el motivo de las cuotas: ");
            setCuotas(x.nextInt());

        }
    }
    
   //metodo para calcular el aguinaldo mensual
    public void aguinaldoMen(){
        int Meses;
        float cash, res;
        System.out.println("\n");
        System.out.println("EMPLEADO MENSUAL");
        System.out.println("Ingresar los años que lleva trabajando el empleado en la empresa: \n");
        Meses = x.nextInt();
        Meses = Meses*12;
        System.out.println("Ingresar el sueldo que recibe el empleado: ");
        cash=x.nextFloat();
        cash = cash/30;
        res = cash*Meses;
        System.out.println("El aguinaldo a recibir es de: " + res + " pesos.");
        System.out.println("\n");
    }
    
    public void mostEmpQuincenal(){
        
    }
    public void mostEmpMensual(){
        
    }
    
}//class