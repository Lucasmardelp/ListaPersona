package com.listaPersonas.Cuadricula.que.enlista.Personas.enumeracion;

public enum Distritos {
    VEINTICINCO_DE_MAYO("25 de Mayo"),
    A_ALSINA("A. Alsina"),
    A_BROWN("A. Brown"),
    ALBERTI("Alberti"),
    ARRECIFES("Arrecife"),
    AVELLANEDA("Avellaneda"),
    AYACUCHO("Ayacucho"),
    AZUL("Azul"),
    B_BLANCA("Bahia Blanca"),
    BALCARCE("Balcarce"),
    BARADERO("Baradero"),
    BERAZATEGUI("Berazategui"),
    BERISSO("Berisso"),
    BOLIVAR("Bolivar"),
    BRAGADO("Bragado"),
    BRANDSEN("Bradsen"),
    C_CASARES("C. Casares"),
    C_DE_ARECO("C. de Areco"),
    C_DORREGO("C. Dorrego"),
    OLAVARRIA("Olavarria"),
    PATAGONES("Patagones"),
    PEHUAJO("Pehuajo"),
    PELLEGRINI("Pellegrini"),
    PERGAMINO("Pergamino"),
    PILA("Pila"),
    PILAR("Pilar"),
    PINAMAR("Pinamar"),
    PTE_PERON("Pte. Perón"),
    PUAN("Puan"),
    PUNTA_INDIO("Punta Indio"),
    QUILMES("Quilmes"),
    R_PEREZ("R. Perez"),
    RAMALLO("Ramallo"),
    RAUCH("Rauch"),
    RIVADAVIA("Rivadavia"),
    ROJAS("Rojas"),
    S_A_DE_ARECO("San Antonio de Areco"),
    S_A_DE_GILES("San Andrés de Giles"),
    SAAVEDRA("Saavedra"),
    SALADILLO("Saladillo"),
    SALLIQUELO("Salliquelo"),
    SALTO("Salto"),
    SAN_CAYETANO("San Cayetano"),
    SAN_FERNANDO("San Fernando"),
    SAN_ISIDRO("San Isidro"),
    SAN_MIGUEL("San Miguel"),
    SAN_NICOLAS("San Nicolas"),
    SAN_PEDRO("San Pedro"),
    SAN_VICENTE("San Vicente"),
    SUIPACHA("Suipacha"),
    T_DE_FEBRERO("Tres de Febrero"),
    T_LAUQUEN("T. Lauquen"),
    TANDIL("Tandil"),
    TAPALQUE("Talalque"),
    TIGRE("Tigre"),
    TORDILLO("Tordillo"),
    TORNQUIST("Tornquist"),
    TRES_ARROYOS("Tres Arroyos"),
    TRES_LOMAS("Tres Lomas"),
    V_GESELL("Villa Gesell"),
    V_LOPEZ("Vicente Lopez"),
    VILLARINO("Villarino"),
    ZARATE("Zarate");


    public  final  String displayName;
    // Constructor que acepta un argumento
    Distritos(String displayName) {
        this.displayName = displayName;
    }
    // Método para obtener el nombre legible
    public String getDisplayName() {
        return displayName;
    }
}
