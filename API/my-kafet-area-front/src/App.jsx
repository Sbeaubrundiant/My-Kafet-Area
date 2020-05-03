import React, {Fragment} from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import AppRouter from './View/router.js'
import BootstrapTable from 'react-bootstrap-table-next';

function App() {
  return (
    <Fragment>
      <AppRouter />
    </Fragment>
  );
}

export default App;
