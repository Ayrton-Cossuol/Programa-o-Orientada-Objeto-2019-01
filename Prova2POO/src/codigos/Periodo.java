package codigos;
/**
 * Classe Periodo tem por caracteristica a maleabilidade com as datas de
 * inicio e de final ou com horarios de inicio e de termino
 * 
 * @author Ayrton S. C.
 * @version 1.0 (junho - 2019)
 *
 */
public class Periodo {
	/** Data inicial passada pelo Usuario */
	private Data dataInicio;
	/** Data final passada pelo Usuario */
	private Data dataFim;
	 /** Horario inicial passada pelo Usuario */
	private Horario horarioInicio;
	/** Horario final passada pelo Usuario */
	private Horario horarioFim;
	/**
	 * Construtor Periodo � inicializado com uma data de inicio, uma data final,
	 * uma hora inicial e uma hora final
	 * 
	 * @param datanoInicio Data inicial dada pelo Usuario
	 * @param datanoFim Data final dada pelo Usuario
	 * @param horarioInicio Hora inicial dada pelo Usuario
	 * @param horarioFim Hora final dada pelo Usuario
	 */
	public Periodo(Data datanoInicio, Data datanoFim, Horario horarioInicio, Horario horarioFim) {
		this.setDataInicio(datanoInicio);
		this.setDataFim(datanoFim);
		this.setHorarioInicio(horarioInicio);
		this.setHorarioFim(horarioFim);
	}
	/**
	 * Construtor sobrecarregado onde � inicializado com um dia inicio, m�s inicio, 
	 * ano inicio, um dia final, m�s final, ano final, hora inicial, minuto inicial,
	 * segundos inicial, hora final, minutos finais e segundos finais
	 * 
	 * @param dianoInicio Dia inicial dada pelo Usuario
	 * @param mesInicio M�s inicial dada pelo Usuario
	 * @param anoInicio Ano inicial dada pelo Usuario
	 * @param dianoFim Dia final dada pelo Usuario
	 * @param mesFim M�s final dada pelo Usuario
	 * @param anoFim Ano final dada pelo Usuario
	 * @param horaInicio Hora inicial dada pelo Usuario
	 * @param minuInicio Minuto inicial dada pelo Usuario
	 * @param segInicio Segundos inicial dada pelo Usuario
	 * @param horaFim Hora final dada pelo Usuario
	 * @param minuFim Minutos finais dada pelo Usuario
	 * @param segFim Segundos finais dada pelo Usuario
	 * @throws Exception Tratamento de valores indevidos
	 */
	public Periodo(int dianoInicio, int mesInicio, int anoInicio, int dianoFim, int mesFim, int anoFim, int horaInicio, int minuInicio, 
			int segInicio, int horaFim, int minuFim, int segFim) throws Exception {
		this.setDataInicio(new Data(dianoInicio, mesInicio, anoInicio));
		this.setDataFim(new Data(dianoFim, mesFim, anoFim));
		this.setHorarioInicio(new Horario(horaInicio, minuInicio, segInicio));
		this.setHorarioFim(new Horario(horaFim, minuFim, segFim));
	}
	/**
	 * Captura da Data inicio 
	 * 
	 * @return a data inicio
	 */
	public Data getDataInicio() {
		return this.dataInicio;
	}
	/**
	 * Captura da Data final
	 * 
	 * @return a data final
	 */
	public Data getDataFim() {
		return this.dataFim;
	}
	/**
	 * Captura do Horario inicial
	 * 
	 * @return o horario inicial
	 */
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}
	/**
	 * Captura do Horario Final
	 * 
	 * @return o horario final
	 */
	public Horario getHorarioFim() {
		return this.horarioFim;
	}
	/**
	 * Modifica��o da Data inicial passada pelo Usuario
	 * 
	 * @param dataInicio Data inicial passada pelo Usuario
	 */
	public void setDataInicio(Data dataInicio) {
		this.dataInicio = dataInicio;
	}
	/**
	 * Modifica��o da Data final passada pelo Usuario
	 * 
	 * @param dataFim Data final passada pelo Usuario
	 */
	public void setDataFim(Data dataFim) {
		this.dataFim = dataFim;
	}
	/**
	 * Modifica��o do Horario incial passada pelo Usuario
	 * 
	 * @param horarioInicio Horario inicial passada pelo Usuario
	 */
	public void setHorarioInicio(Horario horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	/**
	 * Modifica��o do Horario final passada pelo Usuario
	 * 
	 * @param horarioFim Horario final passada pelo Usuario
	 */
	public void setHorarioFim(Horario horarioFim) {
		this.horarioFim = horarioFim;
	}
	/**
	 * Sobreposi��o do toString em que retorna todo o conteudo 
	 * na classe Periodo
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("Data  de inicio: " + this.dataInicio);
		info.append("\nData do fim: " + this.dataFim);
		info.append("\nHorario de inicio: " + this.horarioInicio);
		info.append("\nHorario do fim: " + this.horarioFim);
		return info.toString();
	}
	
}
