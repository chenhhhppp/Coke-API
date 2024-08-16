export default [
  { path: '/', name: '主页', icon: 'smile', component: './Index' },
  {
    path: '/interface_info/:id',
    name: '查看接口',
    icon: 'smile',
    component: './InterfaceInfo',
    hideInMenu: true,
  },
  {
    path: '/user',
    layout: false,
    routes: [{ name: '登录', path: '/user/login', component: './User/Login' }],
  },
  {
    path: '/admin',
    name: '管理页',
    icon: 'crown',
    access: 'canAdmin',
    routes: [
      // { path: '/admin', redirect: '/admin/sub-page' },
      // { path: '/admin/sub-page', name: '二级管理页', component: './Admin' },
      {
        name: '接口管理',
        icon: 'table',
        path: '/admin/interface_info',
        component: './TableList',
      },
      {
        name: '接口分析',
        icon: 'analysis',
        path: '/admin/interface_analysis',
        component: './InterfaceAnalysis',
      },
    ],
  },
  // { name: '查询表格', icon: 'table', path: '/list', component: './TableList' },
  // { path: '/', redirect: '/welcome' },
  { path: '*', layout: false, component: './404' },
];
