import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';

@Component({
  selector: 'app-upload-image',
  templateUrl: './upload-image.component.html',
  styleUrls: ['./upload-image.component.css']
})
export class UploadImageComponent {
 
  msg = false;
  error = false;
  url = "";
  content = "";

  constructor(private adminService:AdminServiceService){}

  onChange(event : any){
    if(event.target.files){
      const file = event.target.files[0];
      const formData = new FormData();
      formData.append('imageFile',file)
      console.log(event.target.files[0])
      if (file.type.match("text/*")) {
        this.url="";
        this.adminService.upload(formData).subscribe(
          stat => { 
            const data: any = stat.valueOf();
            console.log(stat)
            if (data['status']){
              const reader = new FileReader();
              reader.onload = (e) => {
                this.content = reader.result as string;
              }
              reader.readAsText(file);
            }
            else {
              this.msg = false;
              this.error = true;
            }
          }
        )
        return
      }

      this.adminService.upload(formData).subscribe(
        stat => { 
          const data: any = stat.valueOf();
          console.log(stat)
          if (data['status']){
            this.msg = true;
            const reader = new FileReader();
            reader.onload=(event :any) => {
              this.url=reader.result as string;
            }
            reader.readAsDataURL(file);
          }
          else {
            this.msg = false;
            this.error = true;
          } 
        }
      )
    }
  }

  adjust(e : any){
    console.log("dsafsa")
    console.log(e)
   
  }

}
