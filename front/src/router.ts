import Vue from 'vue';
import Router from 'vue-router';
import Home from './views/Home.vue';

Vue.use(Router);

export default new Router({
    routes: [
        {
            path: '/about',
            name: 'about',
            // route level code-splitting
            // this generates a separate chunk (about.[hash].js) for this route
            // which is lazy-loaded when the route is visited.
            component: () => import(/* webpackChunkName: "about" */ './views/About.vue'),
        },
        {
            path: '/test',
            name: '测试',
            component: () => import('./views/test.vue'),
        },
        {
            path: '/home',
            name: '主页',
            component: () => import('./views/Home.vue'),
        },
    ],
});
