import React, {Component} from 'react';
import Header from './components/Header';
import Main from './Main';
import Footer from './components/Footer';
import Home from './Home';
import Profile from './Profile';
import Songs from './Songs';
import Posts from './Posts';

import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom';

import './App.css';
{/*PASS PROP DOWN TO NEEDED*/}
class App extends Component {
  constructor (props) {
    super(props);

    this.state = {
      token : '',
      user : []
    }
  }
  render(){
      return (
        <div className="App">

        <Header />

        <Router>
          <div className="routerNav">
            <nav>
              <Link to="/">Home</Link>{'  '}
              <Link to="/main">Main</Link>{'  '}
              <Link to="/profile">Profile</Link>{'  '}
              <Link to="/songs">Top Songs</Link>{'  '}
              <Link to="/posts">Posts</Link>
            </nav>
            <Route exact path="/" component={Home} />
            <Route path="/main" component={Main} />
            <Route path="/profile" component={Profile} />
            <Route path="/songs" component={Songs} />
            <Route path="/posts" component={Posts} />
          </div>
        </Router>

        <Footer />
        </div>
      );
    }
}

export default App;
