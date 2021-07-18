import React from "react";
import "./App.css";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Login from "./components/Login/login";
import Header from "./components/Header/header";
import SignUp from "./components/Login/signup";
import Home from "./components/Home/home";
import UpdateUser from "./components/Login/update._user";
import { DeleteForeverOutlined } from "@material-ui/icons";
import Receiver from "./components/Receiver/receiver";
import UpdateReceiver from "./components/Receiver/update._receiver";

const App = () => {

  return (
        <>
          <Router>
            <div className="app">
            {/* <Header /> */}
              <Switch>
                <Route exact path="/login">
                  <Login />
                </Route>
                <Route exact path="/signUp">
                  <SignUp />
                </Route>
                <Route exact path="/home">
                  <Home />
                </Route>
                <Route exact path="/receiver">
                  <Receiver />
                </Route>
                <Route exact path="/update_user">
                  <UpdateUser />
                </Route>
                <Route exact path="/update_receiver">
                  <UpdateReceiver />
                </Route>
                

              </Switch>
            </div>
          </Router>
        </>
  );
};

export default App;