package refresh;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("refresh")
public class Refresh {
	int i;
	@GetMapping("r1")
	public ResponseEntity<String> refresh(){
		i++;
		return ResponseEntity.ok().header("refresh","4").body("refreshing.. " + i);
	}

}
