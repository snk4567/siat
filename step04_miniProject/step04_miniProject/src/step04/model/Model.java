//
package step04.model;

import java.util.HashMap;

import step04.model.domain.StudentDTO;

public class Model {
	public static HashMap<Integer, StudentDTO> getAll() {
		HashMap<Integer, StudentDTO> hm = new HashMap<>();
		hm.put(1, new StudentDTO("김민재 ", "010-2533-3905"));
		hm.put(2, new StudentDTO("김세희 ", "010-2161-8927"));
		hm.put(3, new StudentDTO("김희민 ", "010-3413-3768"));
		hm.put(4, new StudentDTO("류정현 ", "010-2766-7523"));
		hm.put(5, new StudentDTO("박경혜 ", "010-7754-1552"));
		hm.put(6, new StudentDTO("박사현 ", "010-4300-0214"));
		hm.put(7, new StudentDTO("서정익 ", "010-4574-7871"));
		hm.put(8, new StudentDTO("염윤선 ", "010-7387-7427"));
		hm.put(9, new StudentDTO("오요셉 ", "010-7180-1153"));
		hm.put(10, new StudentDTO("윤소원 ", "010-7484-3764"));
		hm.put(11, new StudentDTO("임진택 ", "010-9544-2085"));
		
		return hm;

	}

}
