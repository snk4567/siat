package step04.model;

import java.util.HashMap;

import step04.model.domain.StudentDTO;

public class Model {
	public static HashMap<Integer, StudentDTO> getAll() {
		HashMap<Integer, StudentDTO> hm = new HashMap<>();
		hm.put(1, new StudentDTO("±è¹ÎÀç ", "010-2533-3905"));
		hm.put(2, new StudentDTO("±è¼¼Èñ ", "010-2161-8927"));
		hm.put(3, new StudentDTO("±èÈñ¹Î ", "010-3413-3768"));
		hm.put(4, new StudentDTO("·ùÁ¤Çö ", "010-2766-7523"));
		hm.put(5, new StudentDTO("¹Ú°æÇı ", "010-7754-1552"));
		hm.put(6, new StudentDTO("¹Ú»çÇö ", "010-4300-0214"));
		hm.put(7, new StudentDTO("¼­Á¤ÀÍ ", "010-4574-7871"));
		hm.put(8, new StudentDTO("¿°À±¼± ", "010-7387-7427"));
		hm.put(9, new StudentDTO("¿À¿ä¼Á ", "010-7180-1153"));
		hm.put(10, new StudentDTO("À±¼Ò¿ø ", "010-7484-3764"));
		hm.put(11, new StudentDTO("ÀÓÁøÅÃ ", "010-9544-2085"));
		
		return hm;

	}

}
