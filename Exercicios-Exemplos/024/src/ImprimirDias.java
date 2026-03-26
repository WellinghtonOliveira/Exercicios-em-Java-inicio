public class ImprimirDias {
    public void imprimirDias(int dias) {
        if (dias == 0 || dias == 6) {
            System.out.print("Final de semana: ");
        }

        switch (dias) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6: 
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia desconhecido");
                break;
        }
    } 
}
