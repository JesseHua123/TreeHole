module.exports = {
    devServer: {
        proxy: {
            '/api': {
                //target: 'http://47.110.155.99:3030'
                target: 'http://127.0.0.1:8086',
                changeOrigin: true,
                pathRewrite:{
                    '^/api':''
                }
            }
        },
        disableHostCheck: true
    },
    css: {
        loaderOptions: {
            postcss: {
                // options here will be passed to postcss-loader
                plugins: [require('postcss-px2rem')({
                    remUnit: 75
                })]
            }
        }
    }
};
  