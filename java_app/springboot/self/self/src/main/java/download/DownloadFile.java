package download;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("download")
public class DownloadFile {
	@GetMapping("d1")
	public ResponseEntity<Resource> download() throws IOException{
		Path path = Paths.get("quetion-paper.txt");
		Resource res = new UrlResource(path.toUri());
//		Resource res = new UrlResource("quetion-paper.txt");
		return ResponseEntity.ok().header("content-disposition", "attachment;filename=a.txt").body(res);
	}
}
