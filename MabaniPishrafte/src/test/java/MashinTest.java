public class MashinTest {
    class Mashin{
        boolean ayaMashinRoshanAst;
        boolean ayaDarBazAst;
        double toul;
        double arz;
        String mark;


        void roshan(){
            System.out.println("Mahin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamush(){
            System.out.println("Mahin khamoosh ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar(){
            System.out.println("dar baz ast");
            ayaDarBazAst = true;
        }

        void bastaneDar(){
            System.out.println("dar baste ast");
            ayaDarBazAst = false;
        }

        void harkat(){
            if (!ayaDarBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin Dar Hal Harkat Ast");
            }else {
                System.out.println("Mashin Park Ast");
            }
        }
    }
}
