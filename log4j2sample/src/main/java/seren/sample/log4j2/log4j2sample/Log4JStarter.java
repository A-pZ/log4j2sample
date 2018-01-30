/**
 *
 */
package seren.sample.log4j2.log4j2sample;

import java.util.Arrays;
import java.util.List;

import lombok.extern.log4j.Log4j2;

/**
 * @author A-pZ
 *
 */
@Log4j2
public class Log4JStarter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Log4JStarter l = new Log4JStarter();
		l.start();
	}

	public void start() {
		List<String> arrays = Arrays.asList("1,3,6,10,15");
		for (int i=0;i<99;i++) {
		log.debug("logging sample -> {}", arrays);
		}
	}
}
