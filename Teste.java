


import java.time.LocalDate;
import java.util.ArrayList;



public class Teste {
    public static void main(String[]args) {

        Hospital h1 = new Hospital("Sa carneiro", "12574", "Norte");
        Hospital h2 = new Hospital("Zaparata", "12555", "Norte");

        Equipamento e1 = new Equipamento("A11", EquipamentoTipo.BISTURI, "UCI");
        Equipamento e2 = new Equipamento("A12",EquipamentoTipo.CATETER, "Normal");
        Equipamento e3 = new Equipamento("A13",EquipamentoTipo.ESTETOSCOPIO, "Normal");
        Equipamento e4 = new Equipamento("A14",EquipamentoTipo.SERINGA, "Normal");

        Enfermaria En1 = new Enfermaria("AA1", "UCI", 22);
        Enfermaria En2 = new Enfermaria("AA2", "Normal", 20);

        Doente d1 = new Doente("A92885", "Bruno Caridade", "Braga", 68, LocalDate.of(2020, 5, 20));
        Doente d2 = new Doente("A84628", "Carlos Beiramar", "Braga", 67, LocalDate.of(2020, 4, 20));
        Doente d3 = new Doente("A9345", "Carlos Baixo", "Braga", 66, LocalDate.of(2020, 3, 20));

        Medico m1 = new Medico("A9255", "José Afonso", "Médico-Pediatra");
        Medico m2 = new Medico("A86772", "Luís Araújo", "Médico-Cirurgião");


        ListaHospital lista_hospital = new ListaHospital();

        /**
         *  ADICIONAR HOSPITAIS À LISTA HOSPITAL
         */

        lista_hospital.adicionar(h1);
        lista_hospital.adicionar(h2);


        /**
         *  CRIAR LISTAS DE ENFERMARIAS
         */

        ListaEnfermaria lista_enfermaria_1 = new ListaEnfermaria();


        /**
         *   ADICIONAR ENFERMARIAS À LISTA DE ENFERMARIAS
         */

        lista_enfermaria_1.adicionar(En1);
        lista_enfermaria_1.adicionar(En2);

        /**
         *  ADICIONAR AS LISTAS DE ENFERMARIAS AOS HOSPITAIS
         */

        h1.setEnfermarias(lista_enfermaria_1);


        /**
         *  CRIAR LISTAS DE PROFISSIONAIS DE SAUDE
         */

        ListaProfissionaldeSaude profissionais1 = new ListaProfissionaldeSaude();
        ListaProfissionaldeSaude profissionais2 = new ListaProfissionaldeSaude();

        /**
         *  ADICiONAR UM MÉDICO À LISTAS DE PROFISSIONAIS
         */

        profissionais1.adicionar(m1);
        profissionais2.adicionar(m2);



        /**
         *  ADICIONAR FUNCIONÁRIOS ÁS ENFERMARIAS
         */

        En1.setFuncionarios(profissionais1);
        En2.setFuncionarios(profissionais2);

        /**
         *  CRIAR LISTAS DE DOENTES
         */

        ListaDoente lista_doente_1 = new ListaDoente();
        ListaDoente lista_doente_2 = new ListaDoente();
        /**
         *  ADICIONAR DOENTES À LISTA DE DOENTES
         */

        //lista_doente_2""
       lista_doente_1.adicionar(d1);
       lista_doente_1.adicionar(d2);
       lista_doente_1.adicionar(d3);
       lista_doente_1.AlterarEstado(d3,Gravidade.GRAVE);
       lista_doente_1.AlterarEstado(d1,Gravidade.MUITO_GRAVE);
       lista_doente_1.AlterarEstado(d2,Gravidade.GRAVE);
       //System.out.println(d1.toString());
       //System.out.println(h1.getEnfermarias().toString());
        e3.setOcupacao(true);
        e4.setOcupacao(true);


        /**
         * ADICIONAR A LISTA DE DOENTES AO HOSPITAL
         */

        h1.setDoentes(lista_doente_1);
        //System.out.println(h1.getDoentes().toString());

        /**
         * Adicionar Doentes a Lista de Doentes do Medico
         */

        m1.setPacientesAtribuidos(lista_doente_1);


        /**
         *   ADICIONAR A LISTA DE DOENTES À ENFERMARIA
         */

        En1.setDoentes(lista_doente_1);
        En1.setnCamas(En1.getnCamas() - lista_doente_1.size());
        En2.setDoentes(lista_doente_2);
        //System.out.println(En1);


        /**
         *  ADICIONAR LISTA DE DOENTES AO MÉDICO
         */

        m1.setPacientesAtribuidos(lista_doente_1);

        /**
         *  ADICIONAR EQUIPAMENTOS Á ENFERMARIA
         */

        ListaEquipamento listaEquipamento1 = new ListaEquipamento();
        ListaEquipamento listaEquipamento2 = new ListaEquipamento();
        listaEquipamento2.adicionar(e4);
        listaEquipamento2.adicionar(e3);
        listaEquipamento1.adicionar(e2);
        listaEquipamento1.adicionar(e1);
        En1.setEquipamentos(listaEquipamento1);
        En2.setEquipamentos(listaEquipamento2);

        /**
         *  ADICIONAR EQUIPAMENTOS AO HOSPITAL
         */

        h1.setEquipamentos(listaEquipamento1);
        h1.getEquipamentos().UtilizarEquip(e2,d1);
        //System.out.println(h1.getEquipamentos().toString());
        //System.out.println(h1.getEnfermarias().ListaProfissionais(En1.getCodigo()));
        //System.out.println(h1.getDoentes().FiltrarEnfer(En1));
        //lista_doente_1.DashboardDoentes(h1);
        //listaEquipamento1.DashboardEquipamento(EquipamentoTipo.CATETER,h1);
        //lista_enfermaria_1.DashBoardEnferm(h1);
        System.out.println(En1);
    }
}
