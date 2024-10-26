package util;

import entities.Aeronave;
import entities.Ocorrencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderCsv {





    List<Aeronave> aeronaves = new ArrayList<Aeronave>();
    List<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();

    String sourceFileAero = "src\\aeronave.csv";
    String sourceFileOcorrencia = "src\\ocorrencia.csv";


    public List<Aeronave> lerarquivoAeronave() {


        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileAero))) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] field = line.split(",");
                int quantidadeFatalidades = (field[20] == null || field[20].isEmpty() || field[20].equalsIgnoreCase("NULL")) ? 0 : Integer.parseInt(field[20]);
                Aeronave aeronave = new Aeronave(
                        Integer.parseInt(field[0]),
                        Integer.parseInt(field[1]),
                        field[4],
                        field[5],
                        field[6],
                        field[18],
                        quantidadeFatalidades);
                aeronaves.add(aeronave);
                line = br.readLine();
            }
            /*for (Aeronave aeronave : aeronaves) {
                System.out.println(aeronave.toString());
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aeronaves;

    }

    public  List<Ocorrencia> lerArquivoOcorrencia(){
        try(BufferedReader bw = new BufferedReader(new FileReader(sourceFileOcorrencia))){

            String line = bw.readLine();
            line = bw.readLine();

            while (line != null) {

                String[] field = line.split(",");

                Ocorrencia ocorrencia = new Ocorrencia(
                        Integer.parseInt(field[0]),
                        field[1],
                        field[2],
                        field[3],
                        field[4],
                        field[7]
                );
                ocorrencias.add(ocorrencia);
                line = bw.readLine();
            }

            //for (Ocorrencia ocorrencia : ocorrencias) {
              //  System.out.println(ocorrencia.toString());

            //}

        }catch(IOException e){e.printStackTrace();}
            return ocorrencias;


    }}