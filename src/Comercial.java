public class Comercial implements InformeSemestral, InformeCuatrimestral{


    @Override
    public void informeQ1() {
        System.out.println("↓↓↓↓↓↓↓ REPORTES COMERCIALES ↓↓↓↓↓↓");
        System.out.println("Este es el informe del Cuatrimestre 1");
    }

    @Override
    public void informeQ2() {
        System.out.println("Este es el informe del Cuatrimestre 2");
    }

    @Override
    public void informeQ3() {
        System.out.println("Este es el informe del Cuatrimestre 3");
    }

    @Override
    public void semestre1() {
        System.out.println("Este es el informe del Semestre 1");
    }

    @Override
    public void semestre2() {
        System.out.println("Este es el informe del Semestre 2");
    }

}
