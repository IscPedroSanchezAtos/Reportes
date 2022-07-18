public class Main{


    public static void main (String[] args){

        Administrativo adm = new Administrativo();//instanciamos la clase donde implementamos nustras interfaces
        Comercial com = new Comercial();

        adm.informeAnual();
        adm.informeQ1();
        adm.informeQ2();
        adm.informeQ3();
        adm.semestre1();
        adm.semestre2();
        com.informeQ1();
        com.informeQ2();
        com.informeQ3();
        com.semestre1();
        com.semestre2();

        /*class infSemestral implements InformeSemestral{
            public String semestre1(String semestral1){
                return "Este es el informe del primer semestre";
            }
        }
        Administrativo infAnual = new Administrativo();

        //String infsem1 = InformeSemestral.semestre1();
        String infsem2 = InformeSemestral.semestre2();
        String infQ1 = InformeCuatrimestral.informeQ1();
        String infQ2 = InformeCuatrimestral.informeQ2();
        String infQ3 = InformeCuatrimestral.informeQ3();
        System.out.println("↓↓↓↓↓↓↓ REPORTES ADMINISTRATIVOS ↓↓↓↓↓↓");
        System.out.println(infAnual.infAnuales());
        System.out.println();
        //System.out.println(semestre1.+"\n"+infsem2+"\n"+infQ1+"\n"+infQ2+"\n"+infQ3);*/
    }
}
