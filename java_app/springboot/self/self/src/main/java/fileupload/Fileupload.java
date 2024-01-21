package fileupload;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("upload")
public class Fileupload {
	@PostMapping("f1")
	public ResponseEntity<String> upload1(@RequestParam MultipartFile file) throws IOException{
		FileOutputStream fin = new FileOutputStream(file.getOriginalFilename());
		fin.write(file.getBytes());
		return ResponseEntity.ok().body("file is uploaded");
	}
	@PutMapping("f2")
	public ResponseEntity<String> upload2(@RequestParam MultipartFile file, @RequestParam MultipartFile file1) throws IOException{
		FileOutputStream fin = new FileOutputStream(file.getOriginalFilename());
		fin.write(file.getBytes());
		fin.flush();
		fin.close();
		fin = new FileOutputStream(file1.getOriginalFilename());
		fin.write(file1.getBytes());
		return ResponseEntity.ok().body("2 files uploaded");
		
	}
}
