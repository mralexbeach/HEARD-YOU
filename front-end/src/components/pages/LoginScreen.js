import React from 'react';
import Login from './forms/Login';
import Register from './forms/Register';

import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom';

function LoginScreen(props) {
      return (
        <div className="LoginScreen">
            <Router>
              <div className="registerNav">
                <nav>
                  <Link to="/register">Register</Link>{'  '}
                  <Link to="/login">Log In</Link>{'  '}
                </nav>
                <Route exact path="/register" component={Register}/>
                <Route path="/login" component={Login}/>
              </div>
            </Router>
        </div>
      );
}

export default LoginScreen;
