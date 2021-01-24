import axios from 'axios';
import Vue from 'vue';
import Loading from 'muse-ui-loading';



const instance: any = axios.create({
    baseURL: '/api'
});


export default async (type: string, url: string, data: any) => {
    // or


    let response:any;
    if (type === 'GET') {
        response = await instance.get(url, { param: data });
    } else {
        response = await instance[type.toLowerCase()](url, { param: data });
    }
    console.log(response);
    

}

