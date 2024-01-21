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
@RequestMapping("upload")//class level
public class FileUploadController {
	@PostMapping("f1")//method level  localhost:9091/upload/f1
	public ResponseEntity<String> upload1(@RequestParam MultipartFile file) throws IOException{
		FileOutputStream out = new FileOutputStream(file.getOriginalFilename());
		out.write(file.getBytes());
		return ResponseEntity.ok("success");
	}
	@PostMapping("f2")//method level
	public ResponseEntity<String> upload1(@RequestParam MultipartFile file, @RequestParam MultipartFile test) throws IOException{
		FileOutputStream out = new FileOutputStream(file.getOriginalFilename());
		out.write(file.getBytes());
		out.flush();
		out.close();
		out = new FileOutputStream(test.getOriginalFilename());
		out.write(test.getBytes());
		out.flush();
		out.close();
		return ResponseEntity.ok("success");
	}
	@PostMapping("f3")//method level
	public ResponseEntity<String> upload1(@RequestParam MultipartFile file, @RequestParam MultipartFile test, @RequestParam String firstName) throws IOException{
		FileOutputStream out = new FileOutputStream(file.getOriginalFilename());
		out.write(file.getBytes());
		out.flush();
		out.close();
		out = new FileOutputStream(test.getOriginalFilename());
		out.write(test.getBytes());
		out.flush();
		out.close();
		return ResponseEntity.ok("success " + firstName);
	}
	@PostMapping("f4")//method level
	public ResponseEntity<String> upload2(@RequestParam MultipartFile file, @RequestParam MultipartFile test, @RequestParam String firstName) throws IOException{
		String baseDir = "src/main/resources/static/";
		FileOutputStream out = new FileOutputStream(baseDir + file.getOriginalFilename());
		out.write(file.getBytes());
		out.flush();
		out.close();
		out = new FileOutputStream(baseDir + test.getOriginalFilename());
		out.write(test.getBytes());
		out.flush();
		out.close();
		return ResponseEntity.ok("success " + firstName);
	}
}
