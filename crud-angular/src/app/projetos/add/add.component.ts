import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { first } from 'rxjs/operators';
import { ProjetosService } from 'src/app/services/projetos.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.scss']
})
export class AddComponent implements OnInit {
  form: FormGroup;
  loading = false;
  submitted = false;
  range = new FormGroup({
    startDate: new FormControl(),
    endDate: new FormControl(),
  });

  constructor(
    private formBuilder: FormBuilder,
      private route: ActivatedRoute,
      private router: Router,
      private projetosService: ProjetosService
      //private accountService: AccountService,
      //private alertService: AlertService
  ) { 
    this.form = this.formBuilder.group({
      name: ['', Validators.required],
      startDate: ['', Validators.required],
      endDate: ['', Validators.required],
      projectValue: ['', Validators.required],
      risk: ['', Validators.required]
  });
  }

  ngOnInit(): void {
  }

  get f() { return this.form.controls; }

  onSubmit() {
    this.submitted = true;

    if (this.form.invalid) {
      return;
    }
    
    this.loading = true;

    this.projetosService.addProjeto(this.form.value)
      .pipe(first())
      .subscribe({
        next: () => {
          this.router.navigate(['../list'], { relativeTo:this.route});
        },
        error: error => {
          this.loading = false;
        }
      })
  }

}
