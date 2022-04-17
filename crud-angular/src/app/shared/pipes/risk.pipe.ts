import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'risk'
})
export class RiskPipe implements PipeTransform {

  transform(value: string): string {
    switch(value){
      case '1': return 'looks one';
      case '2': return 'looks two';
      case '3': return 'looks 3'; 
    }
    return 'tag';
  }

}
