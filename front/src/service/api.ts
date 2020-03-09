import fetch from '../config/fetch';

export const postData = (url: string, data:any) => fetch('POST', url ,data);