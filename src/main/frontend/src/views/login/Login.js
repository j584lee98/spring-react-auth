import React from "react";

export default () => {
  return (
    <div>
      <form id="login-form" action="/login" method="POST">
        <div>
          <div>Username:</div>
          <input id="username" type="text" />
        </div>
        <div>
          <div>Password:</div>
          <input id="password" type="password" />
        </div>
        <input type="submit" value="Submit" />
      </form>
    </div>
  );
};
