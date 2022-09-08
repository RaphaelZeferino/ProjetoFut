package campeonato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {

        Path campeonato = Path.of("D:/Projeto/Campeonato.csv");

        Long quantidadeJogos = Files.lines(campeonato.toAbsolutePath())
                        .skip(1)
                .count();
        System.out.println("1)" + quantidadeJogos);

        Integer Totalgols = Files.lines(campeonato.toAbsolutePath())
                .skip(1)
                .map(p ->mapToPartida(p))
                .mapToInt(p -> p.getPlcarVisitante() + p.getPlacarMandante())
                .sum();
        System.out.println("2)" + Totalgols);

        Long Anos = Files.lines(campeonato.toAbsolutePath())
                .skip(1)
                .map(p ->mapToPartida(p))
                .filter(p -> p.getDataPartida().getYear() >= 2010 && p.getDataPartida().getYear() <= 2015)
                .count();
        System.out.println("3)" + Anos);

        long maxGols = Files.lines(path.toAbsolutePath())
                .skip(1)
                .map(tabela -> mapToPartida(mapToPartida()))
                .mapToInt(gols -> gols.getPlacarMandante() + gols.getPlcarVisitante())
                .max().getAsInt();
        System.out.println("4)" + maxGols);


    }

    private static Partida mapToPartida(String p) {
        String [] data = p.split(",");

        Partida partida = new Partida();
        partida.setPlacarMandante(Integer.parseInt(data[13]));
        partida.setPlcarVisitante(Integer.parseInt(data[14]));
        partida.setDataPartida(LocalDate.parse(data[2]));
        partida.setMandante(data[5]);
        partida.setVisitante(data[6]);

        return partida;
    }



}