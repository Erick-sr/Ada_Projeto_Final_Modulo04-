package services;

import entities.Aeronave;
import entities.Ocorrencia;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnaliseDeDados {
    private List<Aeronave> aeronaves;
    private List<Ocorrencia> ocorrencias;

    public AnaliseDeDados(List<Ocorrencia> ocorrencias, List<Aeronave> aeronaves) {
        this.ocorrencias = ocorrencias;
        this.aeronaves = aeronaves;
    }

    public Map<String, Long> causasMaisComuns() {
        Map<String, Long> result = ocorrencias
                .stream()
                .collect(Collectors.groupingBy(Ocorrencia::getTipo, Collectors.counting()));

        return result.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toConcurrentMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }


    public Map<String, Long> ocorrenciaPorAno() {
        return ocorrencias.stream().collect(Collectors.groupingBy(year -> year.getDiaOcorrencia()
                .substring(0, 4), Collectors.counting()));
    }

    public Map<String, Long> ocorrenciaPorEstado() {
        return ocorrencias.stream().map(ocorrencias -> {
            String uf = ocorrencias.getUf();
            if (uf == null || uf.isEmpty() || uf.equalsIgnoreCase("***")) {
                return "Não Informado";
            }
            return uf;
        }).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public Map<String, Long> ocorrenciaPorAeronave() {
        return aeronaves.stream().map(aeronave -> {
            String aero = aeronave.getEquipamento();
            if (aero == null || aero.isEmpty() || aero.equalsIgnoreCase("***")) {
                return "Não Informado";
            }
            return aero;
        }).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public Map<String, Long> ocorrenciaPorFabricante() {
        return aeronaves.stream().collect(Collectors.groupingBy(Aeronave::getFabricante, Collectors.counting()));
    }
}



