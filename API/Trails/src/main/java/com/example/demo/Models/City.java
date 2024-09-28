package com.example.demo.Models;

public enum City {

    AR("Angra dos Reis"),
    AP("Aperibé"),
    ARU("Araruama"),
    ARL("Areal"),
    BZ("Armação dos Búzios"),
    AC("Arraial do Cabo"),
    BP("Barra do Piraí"),
    BM("Barra Mansa"),
    BR("Belford Roxo"),
    BJ("Bom Jardim"),
    BJI("Bom Jesus do Itabapoana"),
    CF("Cabo Frio"),
    CM("Cachoeiras de Macacu"),
    CB("Cambuci"),
    CG("Campos dos Goytacazes"),
    CT("Cantagalo"),
    CP("Carapebus"),
    CD("Cardoso Moreira"),
    CR("Carmo"),
    CA("Casimiro de Abreu"),
    CLG("Comendador Levy Gasparian"),
    CMAC("Conceição de Macabu"),
    CO("Cordeiro"),
    DC("Duque de Caxias"),
    EPF("Engenheiro Paulo de Frontin"),
    GP("Guapimirim"),
    IG("Iguaba Grande"),
    ITA("Itaboraí"),
    ITG("Itaguaí"),
    ITV("Italva"),
    ITAO("Itaocara"),
    ITP("Itaperuna"),
    ITT("Itatiaia"),
    JP("Japeri"),
    LM("Laje do Muriaé"),
    MC("Macaé"),
    MCU("Macuco"),
    MG("Magé"),
    MGT("Mangaratiba"),
    MR("Maricá"),
    MD("Mendes"),
    MS("Mesquita"),
    MP("Miguel Pereira"),
    MRA("Miracema"),
    NT("Natividade"),
    NL("Nilópolis"),
    NIT("Niterói"),
    NF("Nova Friburgo"),
    NI("Nova Iguaçu"),
    PC("Paracambi"),
    PS("Paraíba do Sul"),
    PT("Paraty"),
    PA("Paty do Alferes"),
    PTE("Petrópolis"),
    PH("Pinheiral"),
    PRI("Piraí"),
    PCI("Porciúncula"),
    PR("Porto Real"),
    QT("Quatis"),
    QM("Queimados"),
    QS("Quissamã"),
    RS("Resende"),
    RB("Rio Bonito"),
    RC("Rio Claro"),
    RF("Rio das Flores"),
    RO("Rio das Ostras"),
    RJ("Rio de Janeiro"),
    SMM("Santa Maria Madalena"),
    SAP("Santo Antônio de Pádua"),
    SF("São Fidélis"),
    SFI("São Francisco de Itabapoana"),
    SG("São Gonçalo"),
    SJB("São João da Barra"),
    SJM("São João de Meriti"),
    SJU("São José de Ubá"),
    SJVRP("São José do Vale do Rio Preto"),
    SPA("São Pedro da Aldeia"),
    SSA("São Sebastião do Alto"),
    SP("Sapucaia"),
    SQ("Saquarema"),
    SPC("Seropédica"),
    SJ("Silva Jardim"),
    SD("Sumidouro"),
    TG("Tanguá"),
    TP("Teresópolis"),
    TM("Trajano de Moraes"),
    TR("Três Rios"),
    VC("Valença"),
    VS("Varre-Sai"),
    VAS("Vassouras"),
    VR("Volta Redonda");

    private final String city;

    City(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    
    public static City fromCityName(String cityName) {
        for (City city : City.values()) {
            if (city.getCity().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        throw new IllegalArgumentException("Cidade não encontrada: " + cityName);
    }

}
