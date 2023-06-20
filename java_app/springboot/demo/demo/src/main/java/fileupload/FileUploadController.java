package fileupload;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("upload")
public class FileUploadController {
	@PostMapping
	public ResponseEntity<String> upload1(@RequestParam MultipartFile file) throws IOException{
		FileOutputStream out = new FileOutputStream(file.getOriginalFilename());
		out.write(file.getBytes());
		return ResponseEntity.ok("success");
	}
}
